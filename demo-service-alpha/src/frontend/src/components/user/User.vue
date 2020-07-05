<!-- T-Table used from https://vue-tailwind.com/ -->
<template>
    <section>
        <div class="container mx-auto px-6 text-left py-10">
            <t-table
                    :headers="['ID', 'First Name', 'Last Name', 'User Name', 'Salary', 'Age']"
                    :data="this.dataTable"
                    :tbody-class="{ tbody: 'text-base xsd:text-xs smd:text-s mdd:text-sm lg:text-m xl:text-l border-t lg:border-0 text-gray-800 break-all', tr: 'border-0 lg:border-t', td: 'p-3' }"
            >
                <template v-slot:row="{ trClass, tdClass, rowIndex, row }">
                    <tr :class="[trClass, rowIndex % 2 === 0 ? 'bg-gray-100' : '']">
                        <td :class="tdClass">{{ row.id }}</td>
                        <td :class="tdClass">{{ row.firstName }}</td>
                        <td :class="tdClass">{{ row.lastName }}</td>
                        <td :class="tdClass">{{ row.username }}</td>
                        <td :class="tdClass">{{ row.salary }}</td>
                        <td :class="tdClass">{{ row.age }}</td>
                        <td :class="[tdClass, 'text-right', 'w-1/12']">
                        </td>
                    </tr>
                </template>
            </t-table>
        </div>
    </section>
</template>

<script>
    const axios = require("axios");

    export default {
        name: "User",
        data() {
            return {
                dataTable: []
            };
        },
        created() {
            this.fetchUserData();
        },
        methods: {
            async fetchUserData() {
                let response = await axios.get("/v1/users").catch(function (error) {
                    var message = error.message;
                    if (error.response.status === 403) {
                        message = "Not sufficient permissions.";
                        console.error(message)
                    }
                });
                this.dataTable = response.data;
            },
            addUser() {
                // Not defined yet
            },
            editUser() {
                // Not defined yet
            },
            deleteUser() {
                // Not defined yet
            },
        }
    };
</script>
